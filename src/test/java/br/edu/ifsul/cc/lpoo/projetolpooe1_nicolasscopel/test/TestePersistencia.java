/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_nicolasscopel.test;

import br.edu.ifsul.cc.lpoo.projetolpooe1_nicolasscopel.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Scopel
 */
public class TestePersistencia {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        
        jpa.fecharConexao();
        
    }



    //@Test
    
    


}

