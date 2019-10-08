public class Stage {

    private SpotLight[] lights = new SpotLight[4];//创建一个Stage 的实例数组变量 并且赋值 4

    public Stage(){

        lights[0] = new SpotLight("StageLeft",1,1);//把值存入数组内
        lights[1] = new SpotLight("StageRight",7,2);
        lights[2] = new SpotLight("Drummer",16,2);
        lights[3] = new SpotLight("LeadSinger",22,3);

        this.changeSpotLight();
        this.floodLight();

    }
    public void changeSpotLight(){

        lights[0].setColour("yellow");
        lights[1].setColour("red");
        lights[2].setColour("black");
        lights[3].setColour("white");

    }


    public void floodLight(){

        for (int i = 0; i < 4; i++){//循环遍历数组并且打印出来

            System.out.println(lights[i].getName()+"  "+lights[i].getColour()+"  "+lights[i].getID());

        }
    }

    public static void main(String[] args) {

        new Stage();
    }
}
