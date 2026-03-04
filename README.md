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
- [ **command line** ]
```bash
cd simplechat
ant jar-server
ant jar-client
ant run-server -Darg=1234      # Argument is port, Default value: 5555
ant run-client
```
- [ **server process line** ]
>```
>#block <loginID> -> Blocks all messages from the specified client.
>#channel <channel> -> Connects to the specified channel.
>#close -> Stops the server and disconnects all users."
>#getchannel -> Gets the channel the server is currently connected to.
>#getport -> Gets the port the server is listening on.
>#help OR #? -> Lists all commands and their use.
>#nochannel -> Returns the server to the super-channel.
>#private <loginID> <msg> -> Sends a private message to the specified client.
>#pub -> Sends a public message.
>#punt <loginID> -> Kicks client out of the chatroom.
>#quit -> Terminates the server and disconnects all clients.
>#setport <newport> -> Specify the port the server will listen on.
>#start -> Makes the server restart accepting connections.
>#stop -> Makes the server stop accepting new connections.
>#unblock -> Unblock messages from all blocked clients.
>#unblock <loginID> -> Unblock messages from the specified client.
>#warn <loginID> -> Sends a warning message to the specified client.
>#whoblockme -> List clients who are blocking messages from the server.
>#whoiblock -> List all clients that the server is blocking messages from.
>#whoison -> Gets a list of all users and channel they are connected to.
>```
- [ **client process line** ]
>```
>#quit    -> Leave process
>#logoff  -> Close client connection
>#getport -> Client current connection port
>#setport -> Change the connection port from client
>#gethost -> Client current connection host
>#sethost -> Change the connection host from client
>
>#sethost localhost
>#setport 1234
>#login
><bob>  -> ID
><123>  -> PW
>```

## SimpleChat Load Test
> ![Image](https://github.com/NullBins/java-backend-simplechat/blob/master/contents/SimpleChat_Test.png)
