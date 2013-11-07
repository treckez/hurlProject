/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 11418288
 */
@Entity
@Table(name = "hurls")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hurls.findAll", query = "SELECT h FROM Hurls h"),
    @NamedQuery(name = "Hurls.findBySize", query = "SELECT h FROM Hurls h WHERE h.size = :size"),
    @NamedQuery(name = "Hurls.findByMake", query = "SELECT h FROM Hurls h WHERE h.make = :make"),
    @NamedQuery(name = "Hurls.findByWeight", query = "SELECT h FROM Hurls h WHERE h.weight = :weight"),
    @NamedQuery(name = "Hurls.findByHurlID", query = "SELECT h FROM Hurls h WHERE h.hurlID = :hurlID"),
    @NamedQuery(name = "Hurls.findByGrip", query = "SELECT h FROM Hurls h WHERE h.grip = :grip")})
public class Hurls implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private int size;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "make")
    private String make;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private int weight;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "hurlID")
    private Integer hurlID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "grip")
    private String grip;

    public Hurls() {
    }

    public Hurls(Integer hurlID) {
        this.hurlID = hurlID;
    }

    public Hurls(Integer hurlID, int size, String make, int weight, String grip) {
        this.hurlID = hurlID;
        this.size = size;
        this.make = make;
        this.weight = weight;
        this.grip = grip;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Integer getHurlID() {
        return hurlID;
    }

    public void setHurlID(Integer hurlID) {
        this.hurlID = hurlID;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hurlID != null ? hurlID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hurls)) {
            return false;
        }
        Hurls other = (Hurls) object;
        if ((this.hurlID == null && other.hurlID != null) || (this.hurlID != null && !this.hurlID.equals(other.hurlID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Hurls[ hurlID=" + hurlID + " ]";
    }
    
}
