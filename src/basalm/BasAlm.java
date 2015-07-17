/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basalm;
import java.io.*;
import com.linuxense.javadbf.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author witzkito
 */
public class BasAlm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DBFException, FileNotFoundException, IOException, SQLException {
        
        ConeccionBas $conBas = new ConeccionBas();
        ResultSet rs = $conBas.select("SELECT * FROM PES_PESO");
        
          // let us create field definitions first
          // we will go for 3 fields
          //
          DBFField fields[] = new DBFField[15];

          fields[0] = new DBFField();
          fields[0].setName( "P_FECHA");
          fields[0].setDataType( DBFField.FIELD_TYPE_D);

          fields[1] = new DBFField();
          fields[1].setName( "P_TICKET");
          fields[1].setDataType( DBFField.FIELD_TYPE_C);
          fields[1].setFieldLength( 10);
          
          fields[2] = new DBFField();
          fields[2].setName( "P_SOCIO");
          fields[2].setDataType( DBFField.FIELD_TYPE_C);
          fields[2].setFieldLength( 10);
          
          fields[3] = new DBFField();
          fields[3].setName( "P_ARTIC");
          fields[3].setDataType( DBFField.FIELD_TYPE_C);
          fields[3].setFieldLength( 10);
          
          fields[4] = new DBFField();
          fields[4].setName( "P_BRUTO");
          fields[4].setDataType( DBFField.FIELD_TYPE_C);
          fields[4].setFieldLength( 10);
          
          fields[5] = new DBFField();
          fields[5].setName( "P_TARA");
          fields[5].setDataType( DBFField.FIELD_TYPE_C);
          fields[5].setFieldLength( 10);
          
          fields[6] = new DBFField();
          fields[6].setName( "P_NETO");
          fields[6].setDataType( DBFField.FIELD_TYPE_C);
          fields[6].setFieldLength( 10);
          
          fields[7] = new DBFField();
          fields[7].setName( "P_DESCU");
          fields[7].setDataType( DBFField.FIELD_TYPE_C);
          fields[7].setFieldLength( 10);
          
          fields[8] = new DBFField();
          fields[8].setName( "P_FACTU");
          fields[8].setDataType( DBFField.FIELD_TYPE_C);
          fields[8].setFieldLength( 10);
          
          fields[9] = new DBFField();
          fields[9].setName( "P_TRANS");
          fields[9].setDataType( DBFField.FIELD_TYPE_C);
          fields[9].setFieldLength( 50);
          
          fields[10] = new DBFField();
          fields[10].setName( "P_CHAPA");
          fields[10].setDataType( DBFField.FIELD_TYPE_C);
          fields[10].setFieldLength( 30);
          
          fields[11] = new DBFField();
          fields[11].setName( "P_CONDUC");
          fields[11].setDataType( DBFField.FIELD_TYPE_C);
          fields[11].setFieldLength( 50);
          
          fields[12] = new DBFField();
          fields[12].setName( "P_FECACRE");
          fields[12].setDataType( DBFField.FIELD_TYPE_C);
          fields[12].setFieldLength( 10);
          
          fields[13] = new DBFField();
          fields[13].setName( "P_REMITO");
          fields[13].setDataType( DBFField.FIELD_TYPE_C);
          fields[13].setFieldLength( 10);
          
          fields[14] = new DBFField();
          fields[14].setName( "P_RINDE");
          fields[14].setDataType( DBFField.FIELD_TYPE_C);
          fields[14].setFieldLength( 30);

          DBFWriter writer = new DBFWriter(new File( "pes_peso.dbf"));
          writer.setFields( fields);

          // now populate DBFWriter
          //
          while (rs.next()){
            Object rowData[] = new Object[15];
            rowData[0] =rs.getDate("P_FECHA");
            rowData[1] = rs.getString("P_TICKET");
            rowData[2] = rs.getString("P_SOCIO");
            rowData[3] = rs.getString("P_ARTIC");
            rowData[4] = rs.getString("P_BRUTO");
            rowData[5] = rs.getString("P_TARA");
            rowData[6] = rs.getString("P_NETO");
            rowData[7] = rs.getString("P_DESCU");
            rowData[8] = rs.getString("P_FACTU");
            rowData[9] = rs.getString("P_TRANS");
            rowData[10] = rs.getString("P_CHAPA");
            rowData[11] = rs.getString("P_CONDUC");
            rowData[12] = rs.getString("P_FECACRE");
            rowData[13] = rs.getString("P_REMITO");
            rowData[14] = rs.getString("P_RINDE");

            writer.addRecord( rowData);
          }

          writer.write();         
          
    }
    
}
