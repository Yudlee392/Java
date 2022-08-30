/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yudlee
 */
import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable{
    private String ten;
    private String gioiTinh;
    private String noiSinh;
    private int maDinhDanh;
    private int tienLuong;


public Employee(){
}
public Employee(String ten, String gioiTinh, String noiSinh, int maDinhDanh, int tienLuong){
    this.ten = ten;
    this.gioiTinh = gioiTinh;
    this.noiSinh = noiSinh;
    this.maDinhDanh = maDinhDanh;
    this.tienLuong = tienLuong;
}
public String getTen(){
    return ten;
}
public void setTen(String ten){
    this.ten = ten;
}
public String getGioiTinh(){
    return gioiTinh;
}
public void setGioiTinh(String gioiTinh){
    this.gioiTinh = gioiTinh;
}
public String getNoiSinh(){
    return noiSinh;
}
public void setNoiSinh(String noiSinh){
    this.noiSinh = noiSinh;
}
public int getMaDinhDanh(){
    return maDinhDanh;
}
public void setMaDinhDanh(int maDinhDanh){
    this.maDinhDanh= maDinhDanh;
}
public int getTienLuong(){
    return tienLuong;
}
public void setTienLuong(int tienLuong){
    this.tienLuong = tienLuong;
}

@Override
public int hashCode(){
    int hash = 3;
    hash = 83*hash + Objects.hashCode(this.ten);
    hash = 83*hash + Objects.hashCode(this.gioiTinh);
    hash = 83*hash + Objects.hashCode(this.noiSinh);
    hash = 83*hash + this.maDinhDanh;
    hash = 83*hash + this.tienLuong;
    return hash;
}
@Override
public boolean equals(Object obj){
    if(this == obj){
        return true;
    }
    if(obj == null){
        return false;
    }
    if(getClass()!=obj.getClass()){
        return false;
    }
    final Employee other = (Employee) obj;
    if(this.maDinhDanh!= other.maDinhDanh){
        return false;
    }
    if(this.tienLuong!=other.tienLuong){
        return false;
    }
    if(!Objects.equals(this.ten,other.ten)){
        return false;
    }
    if(!Objects.equals(this.noiSinh,other.noiSinh)){
        return false;
    }
        return false;
}
}
