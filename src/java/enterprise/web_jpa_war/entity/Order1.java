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
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
    @NamedQuery(name = "Order1.findByOrderNum", query = "SELECT o FROM Order1 o WHERE o.orderNum = :orderNum"),
    @NamedQuery(name = "Order1.findByQuantity", query = "SELECT o FROM Order1 o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "Order1.findByHurlID", query = "SELECT o FROM Order1 o WHERE o.hurlID = :hurlID"),
    @NamedQuery(name = "Order1.findByCustID", query = "SELECT o FROM Order1 o WHERE o.custID = :custID")})
public class Order1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderNum")
    private Integer orderNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hurlID")
    private int hurlID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "custID")
    private int custID;

    public Order1() {
    }

    public Order1(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Order1(Integer orderNum, int quantity, int hurlID, int custID) {
        this.orderNum = orderNum;
        this.quantity = quantity;
        this.hurlID = hurlID;
        this.custID = custID;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHurlID() {
        return hurlID;
    }

    public void setHurlID(int hurlID) {
        this.hurlID = hurlID;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNum != null ? orderNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.orderNum == null && other.orderNum != null) || (this.orderNum != null && !this.orderNum.equals(other.orderNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Order1[ orderNum=" + orderNum + " ]";
    }
    
}
