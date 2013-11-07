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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 11418288
 */
@Entity
@Table(name = "hurls_hasOrder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HurlshasOrder.findAll", query = "SELECT h FROM HurlshasOrder h"),
    @NamedQuery(name = "HurlshasOrder.findByHurlID", query = "SELECT h FROM HurlshasOrder h WHERE h.hurlID = :hurlID"),
    @NamedQuery(name = "HurlshasOrder.findByOrderID", query = "SELECT h FROM HurlshasOrder h WHERE h.orderID = :orderID"),
    @NamedQuery(name = "HurlshasOrder.findByQuantity", query = "SELECT h FROM HurlshasOrder h WHERE h.quantity = :quantity")})
public class HurlshasOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hurlID")
    private int hurlID;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderID")
    private Integer orderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;

    public HurlshasOrder() {
    }

    public HurlshasOrder(Integer orderID) {
        this.orderID = orderID;
    }

    public HurlshasOrder(Integer orderID, int hurlID, int quantity) {
        this.orderID = orderID;
        this.hurlID = hurlID;
        this.quantity = quantity;
    }

    public int getHurlID() {
        return hurlID;
    }

    public void setHurlID(int hurlID) {
        this.hurlID = hurlID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HurlshasOrder)) {
            return false;
        }
        HurlshasOrder other = (HurlshasOrder) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.HurlshasOrder[ orderID=" + orderID + " ]";
    }
    
}
