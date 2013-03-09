package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class XMLinout
{
	// escreve um arquivo XML
	public static void writeXML(Document documento, String filename)
	{
		XMLOutputter xout = new XMLOutputter();

		try
		{

			// Criando o arquivo de saida

			FileWriter arquivo = new FileWriter(new File(filename));

			// Imprimindo o XML no arquivo

			xout.output(documento, arquivo);

		} catch (IOException e)
		{

			e.printStackTrace();

		}
	}
	// lê um arquivo XML para um tipo Document
	public static Document readXML(String filename)
	{
		Document doc = null;

		SAXBuilder builder = new SAXBuilder();

		try
		{

			doc = builder.build(filename);

		} catch (Exception e)
		{

			e.printStackTrace();

		}
		return doc;
	}

}
