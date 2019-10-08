public class Animals {

    private String name;
    private int population;
    private float growthRate;


    private Animals(String name, int population, float growthRate){//a parameter constructor

       this.name = name;
       this.population = population;
       this.growthRate = growthRate;

    }

    private String Classification() {

        String classf = "EX";//初始化

        if (population >= 30000) {

            classf = "LC";//条件选择赋值
        }

        if (growthRate < 1) {

            classf = "VU";
        }

        if (population < 30000) {

            classf = "EN";
        }

        if (population < 500) {

            classf = "CR";
        }

        return classf;

    }

    private String getName(){//一个方法用于获取名字 需要String返回值

        return this.name;
    }

    private int getPopulation(){//一个方法用于获取数量 需要int返回值

        return this.population;
    }

    public int yearsLeft(){

        int years = 1;//初始化years

        while (population != 0) {//如果population 不等于0 就一直循环下去

            population = (int) (population * growthRate);

            years++;
        }
        return years;
    }


    public static void main(String[] args) {

        Animals[] animals = new Animals[4];//创建一个实例数组

        animals [0] = new Animals("Cheetah", 9000,0.50f);//创建实例数组对象
        animals [1] = new Animals("SumatranTiger",400,0.8f);
        animals [2] = new Animals("BlueWhale",50000,0.9f);
        animals [3] = new Animals("WhiteRhino",3,1.1f);

        //循环遍历数组 打印名字和等级 和数量
       for (int i = 0; i < 4; i++){

           System.out.println(animals[i].getName()+" has a classification:"+animals[i].Classification()+ ", and its population is: "+animals[i].getPopulation());
       }
    }
}
