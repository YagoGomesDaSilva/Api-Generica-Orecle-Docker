package oracle.api.apioracle.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "EXEMPLO_TIPOS")
public class ExemploTipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    // Tipos numéricos
    @Column(name = "NUMERO_INTEIRO")
    private Integer numeroInteiro;

    @Column(name = "NUMERO_LONG")
    private Long numeroLong;

    @Column(name = "NUMERO_DOUBLE")
    private Double numeroDouble;

    @Column(name = "NUMERO_FLOAT")
    private Float numeroFloat;

    @Column(name = "NUMERO_DECIMAL", precision = 20, scale = 6)
    private BigDecimal numeroDecimal;

    // Tipos de data e hora
    @Column(name = "DATA")
    private Date data;

    @Column(name = "HORA")
    private Time hora;

    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;

    // Tipos de caracteres
    @Column(name = "TEXTO", length = 255)
    private String texto;

    @Lob
    @Column(name = "CLOB_TEXTO")
    private Clob clobTexto;

    // Tipos binários
    @Lob
    @Column(name = "BLOB_DADOS")
    private Blob blobDados;

    @Column(name = "BYTE_ARRAY")
    private byte[] byteArray;


    // Boolean
    @Column(name = "FLAG")
    private Boolean flag;

    public ExemploTipos() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroInteiro() {
        return numeroInteiro;
    }

    public void setNumeroInteiro(Integer numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public Long getNumeroLong() {
        return numeroLong;
    }

    public void setNumeroLong(Long numeroLong) {
        this.numeroLong = numeroLong;
    }

    public Double getNumeroDouble() {
        return numeroDouble;
    }

    public void setNumeroDouble(Double numeroDouble) {
        this.numeroDouble = numeroDouble;
    }

    public Float getNumeroFloat() {
        return numeroFloat;
    }

    public void setNumeroFloat(Float numeroFloat) {
        this.numeroFloat = numeroFloat;
    }

    public BigDecimal getNumeroDecimal() {
        return numeroDecimal;
    }

    public void setNumeroDecimal(BigDecimal numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Clob getClobTexto() {
        return clobTexto;
    }

    public void setClobTexto(Clob clobTexto) {
        this.clobTexto = clobTexto;
    }

    public Blob getBlobDados() {
        return blobDados;
    }

    public void setBlobDados(Blob blobDados) {
        this.blobDados = blobDados;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }


    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
