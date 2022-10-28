#Create directory for compiled objects
mkdir target
#Compile .class files to target
javac -d target ./src/java/edu/school21/printer/app/App.java ./src/java/edu/school21/printer/logic/BmpReader.java
#Copy resources folder
cp -r src/resources target/
jar


#Run application
java -cp target edu/school21/printer/app/App
