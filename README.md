# Running the Hello application (commands issued on the console)

## Start the orb daemon
```bash
orbd -ORBInitialPort 1050 -ORBInitialHost localhost
```

## Start the Hello server 
```bash
java HelloServer -ORBInitialPort 1050 -ORBInitialHost localhost; 
cd .\out\production\CORBATest\

```

## Run the client application
```bash
java HelloClient -ORBInitialPort 1050 -ORBInitialHost localhost; 
cd .\out\production\CORBATest\
```