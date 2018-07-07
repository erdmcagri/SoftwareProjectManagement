/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.io.Serializable;
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
@Table(name = "UYE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uye.findAll", query = "SELECT u FROM Uye u"),
    @NamedQuery(name = "Uye.findByOkulno", query = "SELECT u FROM Uye u WHERE u.okulno = :okulno"),
    @NamedQuery(name = "Uye.findByAdi", query = "SELECT u FROM Uye u WHERE u.adi = :adi"),
    @NamedQuery(name = "Uye.findBySoyadi", query = "SELECT u FROM Uye u WHERE u.soyadi = :soyadi"),
    @NamedQuery(name = "Uye.findByBolum", query = "SELECT u FROM Uye u WHERE u.bolum = :bolum"),
    @NamedQuery(name = "Uye.findByTelefon", query = "SELECT u FROM Uye u WHERE u.telefon = :telefon")})
public class Uye implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OKULNO")
    private Long okulno;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "BOLUM")
    private String bolum;
    @Column(name = "TELEFON")
    private String telefon;

    public Uye() {
    }

    public Uye(Long okulno) {
        this.okulno = okulno;
    }

    public Long getOkulno() {
        return okulno;
    }

    public void setOkulno(Long okulno) {
        this.okulno = okulno;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (okulno != null ? okulno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uye)) {
            return false;
        }
        Uye other = (Uye) object;
        if ((this.okulno == null && other.okulno != null) || (this.okulno != null && !this.okulno.equals(other.okulno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Uye[ okulno=" + okulno + " ]";
    }
    
}
