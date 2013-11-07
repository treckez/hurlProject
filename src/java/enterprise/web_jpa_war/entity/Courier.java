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
@Table(name = "courier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courier.findAll", query = "SELECT c FROM Courier c"),
    @NamedQuery(name = "Courier.findByOrderNum", query = "SELECT c FROM Courier c WHERE c.orderNum = :orderNum"),
    @NamedQuery(name = "Courier.findByName", query = "SELECT c FROM Courier c WHERE c.name = :name"),
    @NamedQuery(name = "Courier.findByPhone", query = "SELECT c FROM Courier c WHERE c.phone = :phone"),
    @NamedQuery(name = "Courier.findByCourierID", query = "SELECT c FROM Courier c WHERE c.courierID = :courierID")})
public class Courier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderNum")
    private int orderNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phone")
    private String phone;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "courierID")
    private Integer courierID;

    public Courier() {
    }

    public Courier(Integer courierID) {
        this.courierID = courierID;
    }

    public Courier(Integer courierID, int orderNum, String name, String phone) {
        this.courierID = courierID;
        this.orderNum = orderNum;
        this.name = name;
        this.phone = phone;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCourierID() {
        return courierID;
    }

    public void setCourierID(Integer courierID) {
        this.courierID = courierID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courierID != null ? courierID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courier)) {
            return false;
        }
        Courier other = (Courier) object;
        if ((this.courierID == null && other.courierID != null) || (this.courierID != null && !this.courierID.equals(other.courierID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Courier[ courierID=" + courierID + " ]";
    }
    
}
