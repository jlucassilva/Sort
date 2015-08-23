# Sort

Comando utilizado para criar esse projeto:
```bash
mvn archetype:generate 
  -DgroupId=com.hpedrorodrigues.sort 
  -DartifactId=Sort 
  -DarchetypeArtifactId=maven-archetype-quickstart 
  -DinteractiveMode=false
```

Comando para pegar o código compilado e empacotá-lo em seu formato de distribuição, como um JAR:
```bash
man package
```

Comando para instalar o pacote no repositório local, para uso como uma dependência em outros 
projetos localmente:
```bash
mvn install
```

Commando para excutar:
```bash
java -jar target/Sort-1.0-SNAPSHOT.jar
```

ou 

```bash
mvn exec:java -Dexec.mainClass="com.hpedrorodrigues.sort.algorithm.Runner"
```