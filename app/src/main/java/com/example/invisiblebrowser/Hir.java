package com.example.invisiblebrowser;

public class Hir {

    String hirNeve;
    String link;
    String leiras;
    String szerzoNeve;
    String kozzetetelIdeje;

    public String getHirNeve() {
        return hirNeve;
    }

    public String getLink() {
        return link;
    }

    public String getLeiras() {
        return leiras;
    }

    public String getSzerzoNeve() {
        return szerzoNeve;
    }

    public String getKozzetetelIdeje() {
        return kozzetetelIdeje;
    }

    Hir(String hirNeve, String link, String leiras, String szerzoNeve, String kozzetetelIdeje){
        hirNeve = this.hirNeve;
        link = this.link;
        leiras = this.leiras;
        szerzoNeve = this.szerzoNeve;
        kozzetetelIdeje = this.kozzetetelIdeje;
    }
}
