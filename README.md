# Client-Capes

1) Install & decompile MCP (Minecraft Coder Pack) this code was used with version 918.
2) Setup optifine within your decompiled MPC.
3) Make sure the client doesn't have any issues, you can do this by running it and making sure everything goes smoothly.
4) Go to the file path within your MPC folder src\minecraft\assets\minecraft\<yourfolder> and put your cape image in there (must be a .png).
5) Create a class called `CapeBoolean.java` where your boolean will be stored then copy and paste the code from the CapeBoolean.java repo in there.
6) Go to the optifine.CapeUtils.java class.
7) Paste the code from the CapeUtils.java repo into your CapeUtils.java from `public class CapeUtils` to just above `IImageBuffer iimagebuffer = new IImageBuffer()`.
8) Replace the cape image location in `final ResourceLocation capeTrue = new ResourceLocation("example/example.png");` with your own Cape's path.
