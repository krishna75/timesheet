package uk.ac.bcu.kbe.bioen.webapp.controller;

import org.apache.poi.util.IOUtils;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uk.ac.bcu.kbe.bioen.Settings.LoggingMode;
import uk.ac.bcu.kbe.bioen.Settings.Settings;
import uk.ac.bcu.kbe.bioen.dao.ExcelReader;
import uk.ac.bcu.kbe.bioen.dao.VarCellMappingsReader;
import uk.ac.bcu.kbe.bioen.service.Manager;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: Krishna Sapkota
 * Date: 12/10/13
 * Time: 11:00
 */
@Controller

public class HomeController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    private final String excelFilename = this.getClass().getClassLoader().getResource("timesheet.xlsx").getFile();
    private final String varCellFilename = this.getClass().getClassLoader().getResource("excel-cells.csv").getFile();
    private Manager manager;

    public HomeController() throws IOException {
        manager = new Manager(new ExcelReader(excelFilename),new VarCellMappingsReader(varCellFilename).getArrayValues());
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getBiogasCalculator(ModelMap model) {
        model.addAttribute("message", "Bio-Gas FIT Calculator");
        return "index2";
    }

    @RequestMapping(value = "/input-json", method = RequestMethod.POST)
    @ResponseBody
    public String getBiogasJson(@RequestBody String input) throws ParseException, IOException {
       if (Settings.mode != LoggingMode.NONE){ log.info("input: " + input); }
        manager.setInput(input);
        manager.update();
//        String output = manager.getOutput();
//        if (Settings.mode != LoggingMode.NONE){log.info("output: " + output);}
        return "";
    }

    @RequestMapping(value = "/timesheet.xlsx", method = RequestMethod.GET)
    public void getFile( HttpServletResponse response) {
        try {
            // get your file as InputStream
            InputStream is = new FileInputStream(excelFilename);
            // copy it to response's OutputStream
            IOUtils.copy(is, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException ex) {
            log.debug(ex.getMessage());
        }

    }


}
