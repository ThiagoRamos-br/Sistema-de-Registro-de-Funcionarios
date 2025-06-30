package ClassesProject;

public abstract class Person {
    private String name;
    private Integer age;
    private String cpf;

    public Person(String name, Integer age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
