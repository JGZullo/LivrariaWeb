package bd;

import bd.core.*;
import bd.daos.*;

public class BD
{
    public static final MeuPreparedStatement COMANDO;
    public static final Livros LIVROS; //um como esse para cada classe DAO

    static
    {
    	MeuPreparedStatement comando = null;
     	Livros               livros  = null; //um como esse para cada classe DAO

    	try
        {
            comando =
            new MeuPreparedStatement (
            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
            "jdbc:sqlserver://fs5:1433;databasename=tpwdm1",
            "tpwdm1", "Ehgfb10");

            livros = new Livros (); //um como esse para cada classe DAO
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            System.exit(0); // aborta o programa
        }
        
        COMANDO = comando;
        LIVROS  = livros; //um como esse para cada classe DAO
    }
}