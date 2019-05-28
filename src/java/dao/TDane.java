/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class TDane {
    private String id;
    private String nr;
    private String tytul;
    private String opis;
    private String kwota;
    private String obraz;

    public TDane(String id, String nr, String tytul, String opis, String kwota, String obraz) {
        this.id = id;
        this.nr = nr;
        this.tytul = tytul;
        this.opis = opis;
        this.kwota = kwota;
        this.obraz = obraz;
    }

    public String getId() {
        return id;
    }

    public String getNr() {
        return nr;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpis() {
        return opis;
    }

    public String getKwota() {
        return kwota;
    }

    public String getObraz() {
        return obraz;
    }

    @Override
    public String toString() {
        return "TDane{" + "id=" + id + ", nr=" + nr + ", tytul=" + tytul + ", opis=" + opis + ", kwota=" + kwota + ", obraz=" + obraz + '}';
    }
    
    
}
