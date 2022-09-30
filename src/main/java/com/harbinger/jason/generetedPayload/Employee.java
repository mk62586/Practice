
package com.harbinger.jason.generetedPayload;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;


@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Employee implements Serializable {

    private long id;
   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String empCode;
    @JsonProperty("fName")
    private String fName;
    @JsonProperty("gender")
    private char gender;
    @JsonProperty("iName")
    private String iName;
    @JsonProperty("mName")
    private String mName;
    private long phoneNo;

    private List<AddressList> addressList;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<AddressList> getAddressList() {
        return addressList;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public void setAddressList(List<AddressList> addressList) {
        this.addressList = addressList;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }


}
