from mcp import Server

server = Server()

@server.tool("get_time")
def get_time():
    return {"time": "2025-07-26T18:00:00Z"}

server.start()
