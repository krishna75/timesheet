package uk.ac.bcu.kbe.bioen.service;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import uk.ac.bcu.kbe.bioen.BaseTest;
import uk.ac.bcu.kbe.bioen.dao.ExcelReader;
import uk.ac.bcu.kbe.bioen.dao.VarCellMappingsReader;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
* Created with IntelliJ IDEA.
* User: ID118320
* Date: 22/10/13
* Time: 16:13
* To change this template use File | Settings | File Templates.
*/
public class ManagerTest extends BaseTest {
    Manager manager;

    @Before
    public void initialize() throws IOException {
        VarCellMappingsReader varCellMappingsReader = new VarCellMappingsReader(excelCellsFilename)  ;
        manager = new Manager(new ExcelReader(excelFilename),varCellMappingsReader.getArrayValues());
    }


    @Test   @Ignore
    public void testGetOutput() throws Exception {
       manager.setInput("{\"userId\":\"dsfds\",\"name\":\"Krishna Sapkota\",\"date\":\"12/12/2013\",\"moduleTitle\":\"1\",\"activityDesc\":\"2\",\"startTime\":\"14\",\"endTime\":\"21\",\"breakTime\":\"0\",\"totalTime\":\"6\",\"weekendDay\":\"Sunday\",\"weekendDate\":\"14\",\"weekendMonth\":\"December\",\"weekendYear\":\"2013\"}");

//        String output = manager.getOutput();
//       assertEquals("{\"area\":300.0,\"biogas\":20.0,\"energy\":100.0,\"cows\":200.0}", output);

    }


}
