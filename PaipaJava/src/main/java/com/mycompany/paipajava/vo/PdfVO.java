package com.mycompany.paipajava.vo;

public class PdfVO {

    /*Todo los atributos*/
    int codigopdf;
    String nombrepdf;
    String archivopdf;

    public PdfVO() {
    }

    /*Todo los codigos get*/
    public int getCodigopdf() {
        return codigopdf;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

   

    /*Todo los codigos set*/
    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public String getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(String archivopdf) {
        this.archivopdf = archivopdf;
    }


}
