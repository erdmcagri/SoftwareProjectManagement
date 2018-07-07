/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erdem
 */
@Entity
@Table(name = "OKUNANKITAPLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Okunankitaplar.findAll", query = "SELECT o FROM Okunankitaplar o"),
    @NamedQuery(name = "Okunankitaplar.findByOkno", query = "SELECT o FROM Okunankitaplar o WHERE o.okno = :okno"),
    @NamedQuery(name = "Okunankitaplar.findByKitapadi", query = "SELECT o FROM Okunankitaplar o WHERE o.kitapadi = :kitapadi"),
    @NamedQuery(name = "Okunankitaplar.findByKitapyazari", query = "SELECT o FROM Okunankitaplar o WHERE o.kitapyazari = :kitapyazari"),
    @NamedQuery(name = "Okunankitaplar.findByOno", query = "SELECT o FROM Okunankitaplar o WHERE o.ono = :ono")})
public class Okunankitaplar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OKNO")
    private Integer okno;
    @Column(name = "KITAPADI")
    private String kitapadi;
    @Column(name = "KITAPYAZARI")
    private String kitapyazari;
    @Column(name = "ONO")
    private BigInteger ono;

    public Okunankitaplar() {
    }

    public Okunankitaplar(Integer okno) {
        this.okno = okno;
    }

    public Integer getOkno() {
        return okno;
    }

    public void setOkno(Integer okno) {
        this.okno = okno;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public String getKitapyazari() {
        return kitapyazari;
    }

    public void setKitapyazari(String kitapyazari) {
        this.kitapyazari = kitapyazari;
    }

    public BigInteger getOno() {
        return ono;
    }

    public void setOno(BigInteger ono) {
        this.ono = ono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (okno != null ? okno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Okunankitaplar)) {
            return false;
        }
        Okunankitaplar other = (Okunankitaplar) object;
        if ((this.okno == null && other.okno != null) || (this.okno != null && !this.okno.equals(other.okno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Okunankitaplar[ okno=" + okno + " ]";
    }
    
}
