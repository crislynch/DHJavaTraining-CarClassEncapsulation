class Auto {
    private String marca, modello, targa;
    private int cilindrata;
    public Auto(String marca, String modello, int cilindrata, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public void setMarca() {
        this.marca = marca;
    }
    public void setModello() {
        this.modello = modello;
    }
    public void setCilindrata() {
        this.cilindrata = cilindrata;
    }


}