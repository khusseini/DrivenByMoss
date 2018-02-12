// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2018
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.daw;

/**
 * Interface to the application.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface IApplication extends ObserverManagement
{
    /** The panel layout Arrange. */
    String PANEL_LAYOUT_ARRANGE = "ARRANGE";
    /** The panel layout Mix. */
    String PANEL_LAYOUT_MIX     = "MIX";
    /** The panel layout Edit. */
    String PANEL_LAYOUT_EDIT    = "EDIT";
    /** The panel layout Play. */
    String PANEL_LAYOUT_PLAY    = "PLAY";


    /**
     * Creates a new audio track.
     */
    void addAudioTrack ();


    /**
     * Creates a new effect track.
     */
    void addEffectTrack ();


    /**
     * Creates a new instrument track.
     */
    void addInstrumentTrack ();


    /**
     * Switches the user interface to the panel layout with the given name.
     *
     * @param panelLayout The name of the new panel layout (ARRANGE, MIX, EDIT)
     */
    void setPanelLayout (final String panelLayout);


    /**
     * Returns the active panel layout (ARRANGE, MIX or EDIT).
     *
     * @return (ARRANGE, MIX or EDIT)
     */
    String getPanelLayout ();


    /**
     * Returns whether the current panel layout is ARRANGE.
     *
     * @return True if arrange
     */
    boolean isArrangeLayout ();


    /**
     * Returns whether the current panel layout is MIX.
     *
     * @return True if mixer
     */
    boolean isMixerLayout ();


    /**
     * Returns whether the current panel layout is EDIT.
     *
     * @return True if edit
     */
    boolean isEditLayout ();


    /**
     * Returns whether the current panel layout is PLAY.
     *
     * @return True if touch play
     */
    boolean isPlayLayout ();


    /**
     * Sends a redo command to Bitwig Studio.
     */
    void redo ();


    /**
     * Sends an undo command to Bitwig Studio.
     */
    void undo ();


    /**
     * Duplicates the active selection in Bitwig Studio if applicable.
     */
    public void duplicate ();


    /**
     * Deletes the selected items in Bitwig Studio if applicable.
     */
    public void deleteSelection ();


    /**
     * Equivalent to an Arrow-Left key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void arrowKeyLeft ();


    /**
     * Equivalent to an Arrow-Up key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void arrowKeyUp ();


    /**
     * Equivalent to an Arrow-Right key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void arrowKeyRight ();


    /**
     * Equivalent to an Arrow-Down key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void arrowKeyDown ();


    /**
     * Equivalent to an Enter key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void enter ();


    /**
     * Equivalent to an Escape key stroke on the computer keyboard. The concrete functionality
     * depends on the current keyboard focus in Bitwig Studio.
     */
    void escape ();


    /**
     * Invokes the action for the given action identifier.
     *
     * @param id the action identifier string, must not be `null`
     */
    void invokeAction (final String id);


    /**
     * Toggles the visibility of the note editor panel.
     */
    void toggleNoteEditor ();


    /**
     * Toggles the visibility of the automation editor panel.
     */
    void toggleAutomationEditor ();


    /**
     * Toggles the visibility of the device chain panel.
     */
    void toggleDevices ();


    /**
     * Toggles the visibility of the inspector panel.
     */
    void toggleInspector ();


    /**
     * Toggles the visibility of the mixer panel.
     */
    void toggleMixer ();


    /**
     * Toggles between full screen and windowed user interface.
     */
    void toggleFullScreen ();


    /**
     * Toggles the visibility of the browser panel.
     */
    void toggleBrowserVisibility ();


    /**
     * Returns whether the current project's audio engine is active.
     *
     * @return True if active
     */
    boolean isEngineActive ();


    /**
     * Toggles the on/off state of the audio engine.
     */
    void toggleEngineActive ();


    /**
     * Sets whether the active project's audio engine is active.
     *
     * @param active Current project's engine active.
     */
    void setEngineActive (final boolean active);
}