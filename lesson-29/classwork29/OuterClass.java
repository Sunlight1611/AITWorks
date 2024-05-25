package classwork29;

public class OuterClass {
    private static String staticField = "Статическое поле";
    private String field = "Нестатическое поле";
    private StaticNestedClass staticNestedClassObject;

    static class StaticNestedClass{
        private static String nestedStaticField = "Вложенное статическое поле";

        private String nestedField = "Вложенное поле";
        void display(){
            // Обращение к статическому полю внешного класса
            System.out.println(staticField);

            //Обращение к нестатическому полю внешнего класса
            //   System.out.println(field);//ошибка

            //Обращение к полям самого StaticNestedClass
            //происходит обычным образом
            System.out.println(nestedStaticField);
            System.out.println(nestedField);
        }
    }
    class InnerClass{

        private String innerField = "Внутреннее поле";

        private static String innerStaticField = "Вложенное статическое поле";

        void display(){

        //Нельзя создать статическое поле внутреннего класса
        //private static String innerStaticField = "Внутреннее статическое поле";
            System.out.println(staticField);

            //Обращение к нестатическому полю внешнего класса
            System.out.println(field);

            //Обращение к нестатическому полю экземпляра класса InnerClass в полной форме
            System.out.println(this.innerField);

            //Обращение к статистическому полю внешнего класса в полной форме
            System.out.println(OuterClass.staticField);

            //Обращение к нестатическому полю экземпляра внешнего класса в полной форме
            System.out.println(OuterClass.this.field);

            //Вывести статическое поле вложенного статического класса
            System.out.println(StaticNestedClass.nestedStaticField);

            //Вывести поле вложенного статического класса
            System.out.println(OuterClass.this.staticNestedClassObject.nestedField);

        }
    }

    }

