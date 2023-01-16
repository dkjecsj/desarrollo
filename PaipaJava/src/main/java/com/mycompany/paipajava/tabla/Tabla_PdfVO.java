package com.mycompany.paipajava.tabla;

import com.mycompany.paipajava.vo.ObjectVO;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Tabla_PdfVO {

  /*  PdfDAO dao = null;

    public void visualizar_PdfVO(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("codigopdf");
        dt.addColumn("nombrepdf");
        dt.addColumn("archivopdf");

        dao = new PdfDAO();
        PdfVO vo = new PdfVO();
        ArrayList<PdfVO> list = dao.Listar_PdfVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodigopdf();
                fila[1] = vo.getNombrepdf();
                fila[2] = vo.getArchivopdf();// new JButton("Vacio");

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    
    */
    public void visualizar_OLTVO(JTable tabla, ArrayList<ObjectVO> lists) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("NOMBRE");
        dt.addColumn("FAME/TARJETA");
        dt.addColumn("PUERTO/ID");

        //   ArrayList<String> list = lists;
        if (lists.size() > 0) {
            for (int i = 0; i < lists.size(); i++) {
                Object fila[] = new Object[3];
                fila[0] = lists.get(i).getSn();
                fila[1] = lists.get(i).getFrame();
                fila[2] = lists.get(i).getPuerto();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
