// server.js
app.get('/weather', async (req, res) => {
 const data = await fetch(`https://api.com?key=${process.env.API_KEY}`);
 res.json(data);
});
