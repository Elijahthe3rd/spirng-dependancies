
#***springBoot-dependency Injections***

**Types & Examples**
> * Dependencies with springBoot
>* Dependency injection of objects through instance object
>```java
>package com.example.student;
>import com.example.student.Address;
>  
> @Component
> public class User {
>
>    private final UUID id;
>    private final String name;
>    private final Address address;
>    private final Salary salary;
>       
>    public User( Address address, Salary salary) {
>        this.id = UUID.randomUUID();
>        this.name = "Elijah";
>        this.address = address;
>        this.salary = salary;
>    }
> 
>//Dependencies with springBoot
>
>@SpringBootTest
> class SpringSeleniumApplicationTests {
>   @Autowired
>	private User user;
>}
>}
>```

> * Field Dependency <E.g> 
>```Java 
>NB) Some Examples have been commented out
>
>@Component
>public class User {
>
>private UUID id=UUID.randomUUID();
>
>/**
> * 
> * *
> * Field Injections
> * *
> *
> **/
>    @Autowired
>    private Address address;
>    @Autowired
>    private Salary salary;
>   
>    public void printDetails(){
>       System.out.println(id
>                +"UserName:"
>                +names.get((new Random().nextInt( names.size()-1 )+1) )
>                +" Address :"+address.getHouseNo()
>                +"" +address.getStreet()
>               +"Salary:"+this.salary.getAmount());
>
>}
>}
>```

> * Dependancy Injection via Setters/mutators
>
> [comment]: <> (> Dependency injection via setters/mutators)
>```java 
>  
>   // N.B Constructor is not needed. 
>    @Autowired
>    public void setId( UUID id ) {
>        this.id = UUID.randomUUID();
>    }
>    @Autowired
>    public void setName( String name ) {
>        this.name = "name";
>    }

> ```
 
> * Value injection
> ```java
> @Component
> public class User {
>
>    private UUID id=UUID.randomUUID();
>
>    /**
>     * reading values/streams or constants from application.properties
>     * All is done using the @Value("${}") //Annotation
>     */
>    @Value( "${names}" )
>    private List <String> names;
>
>   /**
>    * Field Injections
>    * *
>    * @Autowired
>    * @params private Address address;
>    * @Autowired
>    * *
>   */
>    private Salary salary;
>
>    public void printDetails(){
>
>        System.out.println("\nID:"+id
>                +"\nUserName:"+names.get((new Random().nextInt( names.size()-1 )+1) )
>                +"\nAddress :\n\t\t:"+address.getHouseNo()
>                +"\n\t\t:" +address.getStreet()
>                +"\nSalary\t:\n\t\t:"+this.salary.getAmount());
>
>    }
>
>    @Override
>    public String toString() {
>        return "User{" +
>                "id=" + id +
>                ", name='" + names.get( 0 ) + '\'' +
>                ", address=" + address +
>                ", salary=" + salary +
>                '}';
>    }
>}
> ```