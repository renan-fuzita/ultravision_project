
package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class RentRegister {
    protected String iDMembership;
    protected String client;
    protected String email;
    protected String planType;
    protected String status;
    protected String bonus;
    protected String idMedia;
    protected String dateOut;
    protected String returnDate;
    protected String timeReturn;
    protected String balance;
    protected String notes;

    public String getiDMembership() {
        return iDMembership;
    }

    public void setiDMembership(String iDMembership) {
        this.iDMembership = iDMembership;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(String idMedia) {
        this.idMedia = idMedia;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getTimeReturn() {
        return timeReturn;
    }

    public void setTimeReturn(String timeReturn) {
        this.timeReturn = timeReturn;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    
    
    
    
    public String Save(){
         try {
            FileWriter fw = new FileWriter("Rented.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("IdMembership :" +this.iDMembership);
            pw.println("Name :" +this.client);
            pw.println("Email: "+this.email);
            pw.println("Plan Type: "+this.planType);
            pw.println("Status: "+this.status);
            pw.println("Bonus: "+this.bonus);
            pw.println("ID Media: "+this.idMedia);
            pw.println("DateOut: "+this.dateOut);
            pw.println("Return Date: "+this.returnDate);
            pw.println("TmeReturn: "+this.timeReturn);
            pw.println("Balance: "+this.balance);
            pw.println("Notes: "+this.notes);
            pw.println("*************");
            
            //flush envia os dados direto para o armazemento
            pw.flush();
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            System.out.println("Error");
            
            
            Logger.getLogger(MediaRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Registed sucessuful";
    }
        
        
    }
    
    

