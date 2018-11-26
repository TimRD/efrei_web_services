public class exo_2_main
{
        public static void main(String[] args)
        {
            try
            {
                String filename = "C:\\Users\\Fabien\\Desktop\\M1 Efrei\\Web Services\\TP\\TP_XML_3\\TP3_DOM\\src\\mail.xml";
                String filename2 = "C:\\Users\\Fabien\\Desktop\\M1 Efrei\\Web Services\\TP\\TP_XML_3\\TP3_DOM\\src\\bib.xml";
                exo_2 ex2=new exo_2();
                ex2.read("To",filename);
                ex2.delete("To",filename);
            }
            catch (Exception e ){
                e.printStackTrace();
            }
        }
}

