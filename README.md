---

# Back-end Server Programming

---

## SimpleChat Phase I
```bash
cd simplechat
ant jar-server
ant run-server
ant jar-client
ant run-client
```

## SimpleChat Phase II
- [ **command line** ]
```bash
cd simplechat
ant jar-server
ant jar-client
ant run-server -Darg=1234      # Argument is port, Default value: 5555
ant run-client -Darg=bob       # Argument is username, Default value: ${arg}
```
- [ **server process line** ]
>```
>#stop    -> Stop listening for client access
>#start   -> Start listening for client access
>#quit    -> Leave process
>#close   -> Server shutdown
>#getport -> Current server access port
>#setport -> Chage server access port
>[just text] (ex. test)    -> SERVER MESSAGE> test
>```
- [ **client process line** ]
>```
>#login [username]    -> ID Login
>#quit    -> Leave process
>#logoff  -> Close client connection
>#getport -> Client current connection port
>#setport -> Change the connection port from client
>#gethost -> Client current connection host
>#sethost -> Change the connection host from client
>```

## SimpleChat Phase III