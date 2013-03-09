package xml;
import java.io.InputStreamReader;
import java.util.List;

import org.jdom2.*;


public class pjava
{
	public static void main(String[] args)
	{

		while (true)
		{
			Console.println("O que deseja fazer?");
			Console.println("(1)Criar um arquivo XML");
			Console.println("(2)Visualizar o conteúdo XML");
			Console.println("(3)Alterar o conteúdo do XML");
			Console.println("(4)Sair");
			// leia opção
			int opcao;
		
			List<Publication> pubs; // lista da publicações
			opcao = Console.readInt("Digite a opção");
			
			if (opcao == 1)
			{
				Element bibliography = new Element("bibliography");
				Document documento = new Document(bibliography);
				XMLinout.writeXML(documento, args[0]);
				Console.println(args[0]+" foi criado com sucesso");
			}	
			
			
			else if (opcao == 2)
			{
				Document documento = XMLinout.readXML(args[0]);
				Element bibliography = documento.getRootElement();
				//buscar o que for lido
				Console.println("Visu");
			}

			else if (opcao == 3)
			{
				Console.println("Alterar");
			}

			else if (opcao == 4)
			{
				break;
			}

			else
			{
				System.out.println("Opção inválida");
			}
		}
		/*
		 * Element agenda = new Element("Agenda"); Document documento = new
		 * Document(agenda);
		 * 
		 * Element pessoa = new Element("Pessoa"); pessoa.setAttribute("nome",
		 * "Fábio");
		 * 
		 * Element endereco = new Element("Endereco"); Element logradouro = new
		 * Element("Logradouro"); logradouro.setText("R. dos Bobos");
		 * 
		 * Element numero = new Element("Numero"); numero.setText("0");
		 * 
		 * Element bairro = new Element("Bairro"); bairro.setText("Jardim");
		 * 
		 * Element cidade = new Element("Cidade"); cidade.setText("Campo Grande");
		 * 
		 * Element uf = new Element("UF"); uf.setText("MS");
		 * 
		 * Element cep = new Element("CEP"); cep.setText("79002-204");
		 * 
		 * Element telefone = new Element("Telefone");
		 * telefone.setAttribute("numero", "9999-9999");
		 * 
		 * endereco.addContent(logradouro); endereco.addContent(numero);
		 * endereco.addContent(bairro); endereco.addContent(cidade);
		 * endereco.addContent(uf); endereco.addContent(cep);
		 * pessoa.addContent(endereco); pessoa.addContent(telefone);
		 * agenda.addContent(pessoa);
		 * 
		 * XMLOutputter xout = new XMLOutputter();
		 * 
		 * try {
		 * 
		 * // Criando o arquivo de saida
		 * 
		 * FileWriter arquivo = new FileWriter(
		 * 
		 * new File(args[0]));
		 * 
		 * // Imprimindo o XML no arquivo
		 * 
		 * xout.output(documento, arquivo);
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 * 
		 * Document doc = null;
		 * 
		 * SAXBuilder builder = new SAXBuilder();
		 * 
		 * try {
		 * 
		 * doc = builder.build(args[0]);
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * } Element agenda1 = doc.getRootElement();
		 * 
		 * List<Element> lista = agenda1.getChildren(); for (Element e : lista) {
		 * 
		 * System.out.println("Nome: " + e.getAttributeValue("nome")); Element tel
		 * = e.getChild("Telefone"); System.out.println("Telefone: " +
		 * tel.getAttributeValue("numero")); Element endereco1 =
		 * e.getChild("Endereco"); System.out.println("Logradouro: " +
		 * endereco1.getChildText("Logradouro")); System.out.println("Numero: " +
		 * endereco1.getChildText("Numero")); System.out.println("Bairro: " +
		 * endereco1.getChildText("Bairro")); System.out.println("Cidade: " +
		 * endereco1.getChildText("Cidade")); System.out.println("UF: " +
		 * endereco1.getChildText("UF")); System.out.println("CEP: " +
		 * endereco1.getChildText("CEP"));
		 * 
		 * }
		 */

	}
}
