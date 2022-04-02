package principal;

import entities.Profissional;
import entities.Servico;
import helpers.InputHelper;
import repositories.ProfissionalRespository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {

            //declarando uma lista de Serviços
            List<Servico> servicos = new ArrayList<Servico>();

            System.out.println("------SERVIÇOS DO PROFISSIONAL--------");
            Integer quantidade = InputHelper.lerNumeroInteiro("\n Quantidade de serviços: ");

            for (int i = 0; i < quantidade; i++) {
                System.out.println("\nEntre com o " +(i+1)+"th serviço");

                Servico servico = new Servico(
                        InputHelper.lerID("Informe o ID do serviço: "),
                        InputHelper.lerTexto("Informe o nome do serviço: "),
                        InputHelper.lerTexto("Informe a descrição do serviço: "),
                        InputHelper.lerValor("Informe o preço do serviço: ")

                );
                //adicionando o serviço na lista
                servicos.add(servico);
            }

            System.out.println("----------DADOS DO PROFISSIONAL----------");

            Profissional profissional = new Profissional(
                    InputHelper.lerID("Informe o ID do profissional: "),
                    InputHelper.lerTexto("Informe o nome do profissional: "),
                    InputHelper.lerTexto("Informe o CPF do profissional: "),
                    InputHelper.lerTexto("informe o telefone do profissional: "),
                    servicos //Lista de serviços
            );
            ProfissionalRespository profissionalRepository = new ProfissionalRespository();
            profissionalRepository.exportarDados(profissional);

        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Ocorreu um erro!", "Atenção", JOptionPane.WARNING_MESSAGE);


        }
    }
}