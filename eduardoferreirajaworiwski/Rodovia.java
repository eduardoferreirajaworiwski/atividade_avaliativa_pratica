package eduardoferreirajaworiwski;

import javax.swing.JOptionPane;

public class Rodovia {
  private String nome = "";
  private Double kmTotal = 0.0;

  public void cadastra() {
    setNome(JOptionPane.showInputDialog(null, "Digite o nome da rodovia "));
    setKmTotal(
        Double.parseDouble(JOptionPane.showInputDialog(null, "Distância da rodovia " + getNome() + " (km)")));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getKmTotal() {
    return kmTotal;
  }

  public void setKmTotal(Double kmTotal) {
    this.kmTotal = kmTotal;
  }

  @Override
  public String toString() {
    return "Rodovia [kmTotal = " + kmTotal + ", nome = " + nome + "]";
  }
}
