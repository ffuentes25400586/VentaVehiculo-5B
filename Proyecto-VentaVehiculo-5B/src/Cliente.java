/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUAWEI MateBook 14
 */
public class Cliente {
    private String rfc;
    private String rs;
    private String email;
    
    Cliente(String rfc, String rs, String email){
        this.rfc=rfc;
        this.rs=rs;
        this.email=email;
    }
    
    @Override
    public String toString(){
        return "RFC del cliente: " + this.rfc + "\n" +
                "RS del cliente: " + this.rs + "\n" +
                "Email del cliente: " + this.email + "\n";
    }
}
