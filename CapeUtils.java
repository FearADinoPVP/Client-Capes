public class CapeUtils
{

public static void downloadCape(final AbstractClientPlayer player)
  { 

	String uname = player.getNameClear();

      if (uname != null && !uname.isEmpty())
      { //You may replace "CapeBoolean" with your classname if you created one with another name for the boolean
        if(CapeBoolean.Cape == true) {				//Edit this to your cape image's file location
      	  final ResourceLocation capeLocation = new ResourceLocation("<your assets folder>/<CapeImageName>.png");
      	  if(capeLocation !=null) {
      		  player.setLocationOfCape(capeLocation);
      	  }
        }
       }
        else {
      	  String ofCapeUrl = "http://s.optifine.net/capes/" + username + ".png";
            String mptHash = FilenameUtils.getBaseName(ofCapeUrl);
            final ResourceLocation resourcelocator = new ResourceLocation("capeof/" + mptHash);
            TextureManager textureManager = Minecraft.getMinecraft().getTextureManager();
            ITextureObject tex = textureManager.getTexture(rl);

            if (tex != null && tex instanceof ThreadDownloadImageData)
            {
                ThreadDownloadImageData thePlayer = (ThreadDownloadImageData)tex;

                if (thePlayer.imageFound != null)
                {
                    if (thePlayer.imageFound.booleanValue())
                    {
                        player.setLocationOfCape(resourcelocator);
                    }

                    return;
                }
            }
