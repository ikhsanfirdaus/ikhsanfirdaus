/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ikhsanfirdaus.latihanmvcjdbc.event;

import edu.ikhsanfirdaus.latihanmvcjdbc.entity.Pelanggan;
import edu.ikhsanfirdaus.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author User
 */
public interface PelangganListener {
    
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
