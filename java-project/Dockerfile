FROM openjdk:11

WORKDIR /usr/src/myapp

COPY . /usr/src/myapp/
#Compile Test.java
RUN javac Test.java
#run Executable 
CMD [ "java","Test"]