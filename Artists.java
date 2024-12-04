
import java.util.ArrayList;


public class Artists extends Informations implements Validation{
    
    private static ArrayList names = new ArrayList<>();
    private static ArrayList pass = new ArrayList<>();

    private static ArrayList<DashboardArtist> digitalArtists = new ArrayList<>();
    private static ArrayList<DashboardArtist> charcoalArtists = new ArrayList<>();
    private static ArrayList<DashboardArtist> landscapeArtists = new ArrayList<>();
    private static ArrayList<DashboardArtist> portraitArtists = new ArrayList<>();

    private int index = 0;
    public static int noOfArtist = 0;
    private String typeOfArtist;
    
    public Artists(String username,String password, String typeOfArtist)
    {
        super(username,password);
        this.typeOfArtist = typeOfArtist;
        try
        {           
            names.add(username);
            pass.add(password);

           
                switch (typeOfArtist) {
                    case "Digital Artist":
                        DashboardArtist digital = new DashboardArtist(username);
                        digital.setVisible(false);
                        digitalArtists.add(digital);
                    break;
                    case "Charcoal Artist":
                        DashboardArtist charcoal = new DashboardArtist(username);
                        charcoal.setVisible(false);
                        charcoalArtists.add(charcoal);
                    break;
                    case "Landscape Artist":
                        DashboardArtist landscape = new DashboardArtist(username);
                        landscape.setVisible(false);
                        landscapeArtists.add(landscape);
                    break;
                    case "Portrait Artist":
                        DashboardArtist portrait = new DashboardArtist(username);
                        portrait.setVisible(false);
                        portraitArtists.add(portrait);
                    break;
                    default:
                        break;
                }
            
             System.out.println(names.get(noOfArtist));
             System.out.println(pass.get(noOfArtist));
             System.out.println(typeOfArtist);
             
            ++noOfArtist;
            
        }catch(Exception e)
        {
            System.out.print("Invalid");
        }     
        
    }
    public Artists()
    {
        super("Unknown","LOL");
    }

    @Override
    public boolean validateLogin(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                index = i;              
                return true; 
            }
        }
        return false; 
    }
    @Override
    public boolean validateRegister(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                return true; 
            }
        }
        return false; 
    }
    
    public void displayDashboard(String type)
    {       
        switch (type) {
            case "Digital Artist":
            digitalArtists.get(index).setVisible(true);
            break;
            case "Charcoal Artist":
            charcoalArtists.get(index).setVisible(true);   
            break;
            case "Landscape Artist":
            landscapeArtists.get(index).setVisible(true);    
            break;
            case "Portrait Artist":
            portraitArtists.get(index).setVisible(true); 
            break;
            default:
                break;
        }


        // if(typeOfArtist)
        // dashboardArtists.get(index).setVisible(true);




    }

    
    
    
    
}
