package repositories;

import entities.Profissional;
import entities.Servico;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ProfissionalRespository {

    public ProfissionalRespository() {
    }

    public void exportarDados(Profissional profissional) throws Exception {

        PrintWriter gravarDados =  new PrintWriter(new FileWriter("c:\\temp\\profissional.txt",true));

        gravarDados.write("\n-----------DADOS DO PROFISSIONAL-----------\n");

        gravarDados.write("\n\tId do profissional: " + profissional.getIdProfissional());
        gravarDados.write("\n\tNome do profissional: " + profissional.getNome());
        gravarDados.write("\n\tCPF do profissional: " + profissional.getCpf());
        gravarDados.write("\n\tTelefone do profissional: " + profissional.getTelefone());


        for (Servico servico : profissional.getServicos()) {

            gravarDados.write("\n-----------SERVIÇOS DO PROFISSIONAL-----------\n");

            gravarDados.write("\n\tID do Serviço: " + servico.getIdServico());
            gravarDados.write("\n\tNome do serviço: " + servico.getNome());
            gravarDados.write("\n\tDescrição do serviço: " + servico.getDescricao());
            gravarDados.write("\n\tPreço do serviço: " + servico.getPreco());
        }

            gravarDados.flush();
            gravarDados.close();


    }
}
