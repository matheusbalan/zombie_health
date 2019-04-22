/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import interfaces.IDataSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class DataSetComponent implements IDataSet {
    private String dataSource = null;
    private String[] attributes = null;
    private String[][] instances = null;

    public DataSetComponent() {
      /* nothing */
    }

    @Override
    public String getDataSource() {
        return dataSource;
    }

    @Override
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
        if (dataSource == null) {
            attributes = null;
            instances = null;
        } else
            readDS();
    }

    @Override
    public String[] requestAttributes() {
        return attributes;
    }

    @Override
    public String[][] requestInstances() {
        return instances;
    }
    
    private void readDS() {
        ArrayList<String[]> instArray = new ArrayList<>();
        try {
            BufferedReader file = new BufferedReader(new FileReader(dataSource));

            String line = file.readLine();
            if (line != null) {
              attributes = line.split(",");
              line = file.readLine();
              while (line != null) {
                String[] instLine = line.split(",");
                instArray.add(instLine);
                line = file.readLine();
              }
              instances = instArray.toArray(new String[0][]);
            }

            file.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }
    
}
