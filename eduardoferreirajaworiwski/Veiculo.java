package eduardoferreirajaworiwski;

import javax.swing.JOptionPane;

public class Veiculo {
  private int anoDeFabricacao = -1;
  private Condutor condutor = new Condutor();

  public void cadastra(int numeroVeiculo) {
    setAnoFabricacao(
        Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de fabricação do veiculo" + numeroVeiculo)));
    condutor.cadastra();
    setCondutor(condutor);
  }

  public boolean getCondutorEmbriagado() {
    return condutor.isEmbriagado();
  }

  public int getAnoFabricacao() {
    return anoDeFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoDeFabricacao = anoFabricacao;
  }

  public Condutor getCondutor() {
    return condutor;
  }

  public void setCondutor(Condutor condutor) {
    this.condutor = condutor;
  }

  @Override
  public String toString() {
    return "{ anoDeFabricacao=" + anoDeFabricacao + ", condutor = " + condutor + " }";
  }

}
