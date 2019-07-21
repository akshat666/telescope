/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.space.telescope.base;

import org.testcontainers.containers.GenericContainer;

/**
 *
 * @author akshat
 */
public interface ContainerFactory {
    
    public GenericContainer createContainer(String containerName);
        
}






