package br.com.dio.desafio.dominio;

public class Locatario {
    private Long idLocatario;
    private String nomeLocatario;
    private Long cpfLocatario;

    private Integer dddLocatario;
    private Long telefoneLocatario;
    private String emailLocatario;
    private CategoriasCNH categoriaCNHLocatario;


    public Locatario(Long idLocatario, String nomeLocatario, Long cpfLocatario, Integer dddLocatario,
                     Long telefoneLocatario, String emailLocatario, CategoriasCNH categoriaCNHLocatario) {
        this.idLocatario = idLocatario;
        this.nomeLocatario = nomeLocatario;
        this.cpfLocatario = cpfLocatario;
        this.dddLocatario = dddLocatario;
        this.telefoneLocatario = telefoneLocatario;
        this.emailLocatario = emailLocatario;
        this.categoriaCNHLocatario = categoriaCNHLocatario;
    }

    public Long getIdLocatario() {
        return idLocatario;
    }

    public void setIdLocatario(Long idLocatario) {
        this.idLocatario = idLocatario;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    public Long getCpfLocatario() {
        return cpfLocatario;
    }

    public void setCpfLocatario(Long cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    public Long getTelefoneLocatario() {
        return telefoneLocatario;
    }

    public void setTelefoneLocatario(Long telefoneLocatario) {
        this.telefoneLocatario = telefoneLocatario;
    }

    public String getEmailLocatario() {
        return emailLocatario;
    }

    public void setEmailLocatario(String emailLocatario) {
        this.emailLocatario = emailLocatario;
    }

    public CategoriasCNH getCategoriaCNHLocatario() {
        return categoriaCNHLocatario;
    }

    public Integer getDddLocatario() {
        return dddLocatario;
    }

    public void setDddLocatario(Integer dddLocatario) {
        this.dddLocatario = dddLocatario;
    }

    public void setCategoriaCNHLocatario(CategoriasCNH categoriaCNHLocatario) {
        this.categoriaCNHLocatario = categoriaCNHLocatario;
    }

    @Override
    public String toString() {
        return "Locatario{" +
                "idLocatario=" + idLocatario +
                ", nomeLocatario='" + nomeLocatario + '\'' +
                ", cpfLocatario=" + cpfLocatario +
                ", dddLocatario=" + dddLocatario +
                ", telefoneLocatario=" + telefoneLocatario +
                ", emailLocatario='" + emailLocatario + '\'' +
                ", categoriaCNHLocatario=" + categoriaCNHLocatario +
                '}';
    }
}
