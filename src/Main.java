public class Main {
    public static void main(String[] args) {
      /* Animal деген класс тузунуз жана бир метод кошунуз.
Анын 3 наследнигин тузунуз.

Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
чыгарыныз.
Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.*/
        Animal[] animals = {
                new Eagle("Mountain eagle "),
                new Turtle("Pacific turtle "),
                new Shark("White shark ")};

        for (Animal a:animals) {
            a.living();
            if (a.getClass().equals(Eagle.class)) {
                ((Eagle) a).fly("Mountain eagle");
            } else if (a.getClass().equals(Turtle.class)) {
                ((Turtle) a).swim("Pacific ocean");
            } else if (a.getClass().equals(Shark.class)) {
                ((Shark) a).attack("White shark");
            }

            }



    
        }
    }
