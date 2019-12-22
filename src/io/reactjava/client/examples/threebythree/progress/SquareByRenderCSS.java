/*==============================================================================

name:       SquareByRenderCSS.java

purpose:    Three By Three Square whose style is dynamically generated by css.

history:    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

notes:
                        COPYRIGHT (c) BY GIAVANEERS, INC.
         This source code is licensed under the MIT license found in the
             LICENSE file in the root directory of this source tree.

==============================================================================*/
                                       // package --------------------------- //
package io.reactjava.client.examples.threebythree.progress;

                                       // imports --------------------------- //
import io.reactjava.client.core.react.Component;

                                       // SquareByRenderCSS ==================//
public class SquareByRenderCSS extends Component
{
                                       // class constants ------------------- //
                                       // (none)                              //
                                       // class variables ------------------- //
                                       // public instance variables --------- //
                                       // (none)                              //
                                       // protected instance variables -------//
                                       // (none)                              //
                                       // private instance variables -------- //
                                       // (none)                              //
/*------------------------------------------------------------------------------

@name       render - render component
                                                                              */
                                                                             /**
            Render component. This implementation includes only markup.

@return     void

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes
                                                                              */
//------------------------------------------------------------------------------
public final void render()
{
   useState("color", "blue");
   boolean bPending = "pending".equals(getStateString("color"));

                                       // use Paper instead of div to allow   //
                                       // non-string parameter 'clickhandler" //
                                       // to be passed as a property by parent//
                                       // which can't be done for div         //
/*--
   <@material-ui.core.Paper onClick={props().get("clickhandler")}>
--*/
   if (bPending)
   {
/*--
      <@material-ui.core.CircularProgress class="progress" />
--*/
   }
/*--
   </@material-ui.core.Paper>
--*/
};
/*------------------------------------------------------------------------------

@name       renderCSS - get component css
                                                                              */
                                                                             /**
            Get component css.This implementation is all css, with no java
            code included.

@return     void

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public void renderCSS()
{
   String  posValue = "static";
   String  color    = getStateString("color");
   boolean bPending = "pending".equals(color);
   if (bPending)
   {
      color    = "white";
      posValue = "relative";
   }
/*--
   .progress
   {
      z-index:   10;
      position:  absolute;
      top:       50%;
      left:      50%;
      transform: translate(-50%, -50%);
   }
   {cssSelectorForId()}
   {
      padding-top:      100%;
      background-color: {color};
      position:         {posValue};
   }
--*/
}
}//====================================// end SquareByRenderCSS ==============//
