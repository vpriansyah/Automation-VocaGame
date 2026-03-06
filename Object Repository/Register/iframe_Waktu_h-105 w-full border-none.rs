<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>iframe_Waktu_h-105 w-full border-none</name>
   <tag></tag>
   <elementGuidId>37b30f65-694b-45ac-9cc7-94d4bdbb3725</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>iframe.h-105.w-full.border-none</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='modalContent']/iframe</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>iframe</value>
      <webElementGuid>45a6081b-d374-4ef2-bda6-72fdffdb5f8c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>title</name>
      <type>Main</type>
      <value>Email Content</value>
      <webElementGuid>36cd146e-3425-4a00-b9f9-1cc79ce8dd5c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>srcdoc</name>
      <type>Main</type>
      <value>
                    &lt;!DOCTYPE html>
                    &lt;html>
                    &lt;head>
                        &lt;meta charset=&quot;utf-8&quot;>
                        &lt;meta name=&quot;viewport&quot; content=&quot;width=device-width, initial-scale=1&quot;>
                        &lt;style>
                            body { 
                                margin: 0; 
                                padding: 20px; 
                                font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
                                line-height: 1.6; 
                                color: #333;
                            }
                            img { max-width: 100%; height: auto; }
                            a { color: #667eea; text-decoration: none; }
                            a:hover { text-decoration: underline; }
                            h1, h2, h3 { margin: 16px 0 8px 0; color: #222; }
                            p { margin-bottom: 12px; }
                            ul, ol { margin: 12px 0; padding-left: 20px; }
                            blockquote { 
                                border-left: 4px solid #667eea; 
                                padding-left: 16px; 
                                margin: 16px 0; 
                                color: #666; 
                                font-style: italic; 
                            }
                        &lt;/style>
                        &lt;script>
                            // 处理链接点击，避免跨域iframe问题
                            function handleLinks() {
                                const links = document.querySelectorAll('a[href]');
                                links.forEach(function(link) {
                                    // 避免重复添加事件监听器
                                    if (link.dataset.linkHandled) return;
                                    link.dataset.linkHandled = 'true';
                                    
                                    link.addEventListener('click', function(e) {
                                        e.preventDefault();
                                        const href = this.getAttribute('href');
                                        if (href &amp;&amp; href !== '#' &amp;&amp; !href.startsWith('javascript:')) {
                                            // 发送消息给父窗口
                                            window.parent.postMessage({
                                                type: 'openLink',
                                                url: href
                                            }, '*');
                                        }
                                    });
                                });
                            }
                            
                            // 初始处理和动态内容观察
                            function initializeLinkHandling() {
                                // 初始处理链接
                                handleLinks();
                                
                                // 处理动态内容（如果邮件内容包含动态加载的元素）
                                const observer = new MutationObserver(function(mutations) {
                                    mutations.forEach(function(mutation) {
                                        if (mutation.type === 'childList') {
                                            handleLinks();
                                        }
                                    });
                                });
                                
                                // 开始观察
                                observer.observe(document.body, {
                                    childList: true,
                                    subtree: true
                                });
                            }
                            
                            // 尝试多种方式确保脚本执行
                            if (document.readyState === 'loading') {
                                document.addEventListener('DOMContentLoaded', initializeLinkHandling);
                            } else {
                                // 如果DOM已经加载完成，立即执行
                                initializeLinkHandling();
                            }
                    &lt;/script>
                    &lt;/head>
                    &lt;body>
                        &lt;!DOCTYPE html>&lt;html lang=&quot;en&quot;>&lt;head>&lt;meta charset=&quot;UTF-8&quot;>&lt;meta name=&quot;viewport&quot; content=&quot;width=device-width,initial-scale=1&quot;>&lt;title>VocaGame Notification&lt;/title>&lt;link href=&quot;https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:ital,wght@0,200..800;1,200..800&amp;display=swap&quot; rel=&quot;stylesheet&quot;>&lt;/head>&lt;body>&lt;div style=&quot;width:100%;max-width:450px;margin:0 auto;padding:10px;font-family:'Plus Jakarta Sans',sans-serif;font-optical-sizing:auto;font-style:normal&quot;>&lt;img src=&quot;https://content-src.vocagame.com/assets/vocagame-animate.gif&quot; alt=&quot;logo&quot; style=&quot;margin:0 auto;display:block;width:200px&quot;> &lt;img src=&quot;https://content-src.vocagame.com/assets/account-confirm.png&quot; alt=&quot;account confirm&quot; style=&quot;margin:30px auto;display:block;width:400px&quot;>&lt;p style=&quot;font-size:30px;color:#363a57;margin-bottom:16px;margin-top:40px;font-weight:700;text-align:center&quot;>New OTP Notification&lt;/p>&lt;div style=&quot;border-radius:100px;font-size:24px;color:#16c829;margin:0 auto 16px;border:2px dashed #16c829;padding:10px 100px;width:max-content&quot;>&lt;p style=&quot;padding:0;margin:0;letter-spacing:5px&quot;>990453&lt;/p>&lt;/div>&lt;p style=&quot;font-size:15px;color:#979dad;text-align:center&quot;>Do not give OTP to anyone, including parties claiming to be from admin.
 OTP Valid for 10 minutes&lt;/p>&lt;div style=&quot;width:100%;text-align:center;margin-top:12px;align-content:center;gap:8px&quot;>&lt;a href=&quot;https://q9yl4pxn.r.ap-southeast-1.awstrack.me/L0/https:%2F%2Fwww.facebook.com%2Fvocagame/1/010e019cc30b73e5-4517062b-3cbe-4c6a-b48f-5e0e41985ed0-000000/j92jEWM5oOUuo1G-aYULgwZjcH4=253&quot; target=&quot;_blank&quot; style=&quot;text-decoration:none&quot;>&lt;img src=&quot;https://content-src.vocagame.com/assets/social-facebook.png&quot; alt=&quot;facebook&quot; style=&quot;width:32px&quot;>&lt;/a>&lt;a href=&quot;https://q9yl4pxn.r.ap-southeast-1.awstrack.me/L0/https:%2F%2Fwww.instagram.com%2Fvocagame/1/010e019cc30b73e5-4517062b-3cbe-4c6a-b48f-5e0e41985ed0-000000/taikknaZgibKF-kHg2LO03vVyr8=253&quot; target=&quot;_blank&quot; style=&quot;text-decoration:none&quot;>&lt;img src=&quot;https://content-src.vocagame.com/assets/social-instagram.png&quot; alt=&quot;instagram&quot; style=&quot;width:32px&quot;>&lt;/a>&lt;a href=&quot;https://q9yl4pxn.r.ap-southeast-1.awstrack.me/L0/https:%2F%2Fwww.linkedin.com%2Fcompany%2Fvocagame/1/010e019cc30b73e5-4517062b-3cbe-4c6a-b48f-5e0e41985ed0-000000/TKvFH_WRTzbMsvUsAovZMn8gJbs=253&quot; target=&quot;_blank&quot; style=&quot;text-decoration:none&quot;>&lt;img src=&quot;https://content-src.vocagame.com/assets/social-linkedin.png&quot; style=&quot;width:32px&quot; alt=&quot;linkedin&quot;>&lt;/a>&lt;a href=&quot;https://q9yl4pxn.r.ap-southeast-1.awstrack.me/L0/https:%2F%2Fwww.youtube.com%2F@vocagame/1/010e019cc30b73e5-4517062b-3cbe-4c6a-b48f-5e0e41985ed0-000000/YwEzR6cNLHGl4zjuO_Was-KtQQs=253&quot; target=&quot;_blank&quot; style=&quot;text-decoration:none&quot;>&lt;img src=&quot;https://content-src.vocagame.com/assets/social-youtube.png&quot; alt=&quot;youtube&quot; style=&quot;width:32px&quot;>&lt;/a>&lt;/div>&lt;/div>&lt;img alt=&quot;&quot; src=&quot;https://q9yl4pxn.r.ap-southeast-1.awstrack.me/I0/010e019cc30b73e5-4517062b-3cbe-4c6a-b48f-5e0e41985ed0-000000/cnTPm0jEW4B-RYn4sS7n4LXwhdw=253&quot; style=&quot;display: none; width: 1px; height: 1px;&quot;>
&lt;/body>&lt;/html>

                    &lt;/body>
                    &lt;/html>
                </value>
      <webElementGuid>4b7efc8f-9ff7-417f-b0fb-65ef2a46f690</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>h-105 w-full border-none</value>
      <webElementGuid>9a0758f9-9eec-4567-b7d8-81b47cd03c53</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>sandbox</name>
      <type>Main</type>
      <value>allow-same-origin allow-scripts</value>
      <webElementGuid>951302c6-80f1-4db6-9f9b-4de19630c84d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;modalContent&quot;)/iframe[@class=&quot;h-105 w-full border-none&quot;]</value>
      <webElementGuid>b5cb6efa-6d5e-43a1-9487-3f04dc4627fc</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='modalContent']/iframe</value>
      <webElementGuid>0a087a32-3311-4d30-9150-3fcc239abb70</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//iframe</value>
      <webElementGuid>6b93323d-cc92-4441-b8d6-bae4889a35b0</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//iframe[@title = 'Email Content']</value>
      <webElementGuid>98b0cb46-7f21-4dcf-9dc2-5272caa8154d</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
