public class SpotLight {

    private String name;
    private int ID;
    private String colour;
    private int StageLocation;

    public SpotLight(String name, int ID, String colour,int StageLocation){

        this.name = name;
        this.colour = colour;
        this.ID = ID;
        this.StageLocation = StageLocation;

    }
    public SpotLight(String name,int ID,int StageLocation){

        this.name = name;
        this.colour = colour;
        this.ID = ID;
        this.StageLocation = StageLocation;

    }

    public String getName(){//获取名字

        return this.name;
    }

    public void setColour(String newColour){

        this.colour = newColour;//输入新的颜色然后赋值给回colour
    }

    public int getID(){//获取ID

        return this.ID;
    }

    public String getColour(){//获取颜色

        return this.colour;
    }
}
