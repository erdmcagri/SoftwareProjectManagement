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
@Table(name = "KITAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kitap.findAll", query = "SELECT k FROM Kitap k"),
    @NamedQuery(name = "Kitap.findByKitapno", query = "SELECT k FROM Kitap k WHERE k.kitapno = :kitapno"),
    @NamedQuery(name = "Kitap.findByKitapadi", query = "SELECT k FROM Kitap k WHERE k.kitapadi = :kitapadi"),
    @NamedQuery(name = "Kitap.findByKitapyazari", query = "SELECT k FROM Kitap k WHERE k.kitapyazari = :kitapyazari"),
    @NamedQuery(name = "Kitap.findByYayinevi", query = "SELECT k FROM Kitap k WHERE k.yayinevi = :yayinevi"),
    @NamedQuery(name = "Kitap.findByAtarih", query = "SELECT k FROM Kitap k WHERE k.atarih = :atarih"),
    @NamedQuery(name = "Kitap.findByOkunmasayisi", query = "SELECT k FROM Kitap k WHERE k.okunmasayisi = :okunmasayisi"),
    @NamedQuery(name = "Kitap.findByBegensayisi", query = "SELECT k FROM Kitap k WHERE k.begensayisi = :begensayisi"),
    @NamedQuery(name = "Kitap.findByBegenmesayisi", query = "SELECT k FROM Kitap k WHERE k.begenmesayisi = :begenmesayisi"),
    @NamedQuery(name = "Kitap.findByDurum", query = "SELECT k FROM Kitap k WHERE k.durum = :durum")})
public class Kitap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KITAPNO")
    private Integer kitapno;
    @Column(name = "KITAPADI")
    private String kitapadi;
    @Column(name = "KITAPYAZARI")
    private String kitapyazari;
    @Column(name = "YAYINEVI")
    private String yayinevi;
    @Column(name = "ATARIH")
    private String atarih;
    @Column(name = "OKUNMASAYISI")
    private Integer okunmasayisi;
    @Column(name = "BEGENSAYISI")
    private Integer begensayisi;
    @Column(name = "BEGENMESAYISI")
    private Integer begenmesayisi;
    @Column(name = "DURUM")
    private String durum;

    public Kitap() {
    }

    public Kitap(Integer kitapno) {
        this.kitapno = kitapno;
    }

    public Integer getKitapno() {
        return kitapno;
    }

    public void setKitapno(Integer kitapno) {
        this.kitapno = kitapno;
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

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public String getAtarih() {
        return atarih;
    }

    public void setAtarih(String atarih) {
        this.atarih = atarih;
    }

    public Integer getOkunmasayisi() {
        return okunmasayisi;
    }

    public void setOkunmasayisi(Integer okunmasayisi) {
        this.okunmasayisi = okunmasayisi;
    }

    public Integer getBegensayisi() {
        return begensayisi;
    }

    public void setBegensayisi(Integer begensayisi) {
        this.begensayisi = begensayisi;
    }

    public Integer getBegenmesayisi() {
        return begenmesayisi;
    }

    public void setBegenmesayisi(Integer begenmesayisi) {
        this.begenmesayisi = begenmesayisi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kitapno != null ? kitapno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kitap)) {
            return false;
        }
        Kitap other = (Kitap) object;
        if ((this.kitapno == null && other.kitapno != null) || (this.kitapno != null && !this.kitapno.equals(other.kitapno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "library.Kitap[ kitapno=" + kitapno + " ]";
    }
    
}
