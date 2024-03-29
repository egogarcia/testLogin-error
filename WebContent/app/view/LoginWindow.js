/*
 * File: app/view/LoginWindow.js
 *
 * This file was generated by Sencha Architect version 2.1.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.1.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.1.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.LoginWindow', {
    extend: 'Ext.window.Window',

    height: 205,
    id: 'LoginWindow',
    itemId: 'LoginWindow',
    width: 400,
    autoScroll: false,
    layout: {
        align: 'center',
        pack: 'center',
        type: 'vbox'
    },
    title: 'Acceso Clientes',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'textfield',
                    flex: 0,
                    itemId: 'UserNameTextField',
                    width: 235,
                    fieldLabel: 'Usuario'
                },
                {
                    xtype: 'textfield',
                    flex: 0,
                    itemId: 'PasswordTextField',
                    inputType: 'password',
                    fieldLabel: 'Password',
                    minLength: 8
                },
                {
                    xtype: 'button',
                    height: 25,
                    itemId: 'DoLoginButton',
                    width: 110,
                    text: 'Acceder'
                }
            ]
        });

        me.callParent(arguments);
    }

});