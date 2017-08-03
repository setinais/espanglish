package br.edu.vinnicyus.espanglish.Model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Vinnicyus on 24/07/2017.
 */
@Table (name = "paises", id="id")
public class Pais extends Model{

    @Column (name = "nome")
    private String nome;

    @Column (name = "codigo")
    private String codigo;

    @Column (name = "lingua")
    private String lingua;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String url) {
        this.codigo = url;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
}
